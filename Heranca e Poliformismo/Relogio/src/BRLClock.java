public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(final Clock clock) {
        this.setSegundos(clock.getSegundos());
        this.setMinutos(clock.getMinutos());

        if (clock instanceof USClock usClock) {
            this.setHoras(usClock.getPeriodIndicator().equals("PM")
                    ? usClock.getHoras() + 12
                    : usClock.getHoras());
        } else if (clock instanceof BRLClock brlClock) {
            this.setHoras(brlClock.getHoras());
        }
        return this;
    }
}

