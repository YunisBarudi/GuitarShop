abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder Builder, String Model, Type Type, Wood BackWood, Wood TopWood) {
        builder = Builder;
        model = Model;
        type = Type;
        backWood = BackWood;
        topWood = TopWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Type getType() {
        return type;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }
}
