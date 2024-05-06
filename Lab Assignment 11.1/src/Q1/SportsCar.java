class SportsCar {
    private String model;

    public SportsCar(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // Ensure proper equality checks for the search method to work correctly
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SportsCar sportsCar = (SportsCar) obj;
        return model != null ? model.equals(sportsCar.model) : sportsCar.model == null;
    }

    @Override
    public String toString() {
        return model;
    }
}
