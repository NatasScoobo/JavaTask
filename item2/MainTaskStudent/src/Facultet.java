public enum Facultet {
    CHEMISTRY("Химии"),
    HISTORICAL("Истории"),
    JOURNALISM("Журналистики"),
    MATHEMATICIANS("Математики"),
    PHILOSOPHY("Философии"),
    PHYSICS("Физики"),
    RADIOMECHANICS("Радио-Механики");

    private String translateFacultet;

    Facultet(String translateFacultet) {
        this.translateFacultet = translateFacultet;
    }

    public String getTranslateFacultet() {
        return translateFacultet;
    }

    @Override
    public String toString() {
        return  translateFacultet;
    }
}
