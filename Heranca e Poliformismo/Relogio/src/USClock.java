public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    private void setPeriodIndicator(String period) {
        this.periodIndicator = period;
    }

    @Override
    public void setHoras(int horas) {
        if (horas < 0 || horas > 23) {
            this.setPeriodIndicator("AM");
            super.setHoras(0);
        } else {
            if (horas == 0) {
                this.setPeriodIndicator("AM");
                super.setHoras(12);
            } else if (horas < 12) {
                this.setPeriodIndicator("AM");
                super.setHoras(horas);
            } else {
                this.setPeriodIndicator("PM");
                super.setHoras(horas == 12 ? 12 : horas - 12);
            }
        }
    }

    @Override
    public Clock convert(final Clock clock) {
        this.setSegundos(clock.getSegundos());
        this.setMinutos(clock.getMinutos());

        if (clock instanceof BRLClock brlClock) {
            this.setHoras(brlClock.getHoras());
        } else if (clock instanceof USClock usClock) {
            this.setHoras(usClock.getHoras());
            this.setPeriodIndicator(usClock.getPeriodIndicator());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + periodIndicator;
    }
}
