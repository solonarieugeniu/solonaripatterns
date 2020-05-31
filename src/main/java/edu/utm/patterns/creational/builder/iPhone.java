package edu.utm.patterns.creational.builder;

import lombok.Getter;

@Getter
public class iPhone {

    private String model;
    private String operationalSystem;
    private double screen;
    private int camera;
    private String processor;

    public iPhone(iPhoneBuilder builder) {
        this.model = builder.model;
        this.operationalSystem = builder.operationalSystem;
        this.screen = builder.screen;
        this.camera = builder.camera;
        this.processor = builder.processor;
    }

    public static class iPhoneBuilder {

        private String model;
        private String operationalSystem;
        private double screen;
        private int camera;
        private String processor;

        public iPhoneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public iPhoneBuilder setOperationalSystem(String operationalSystem) {
            this.operationalSystem = operationalSystem;
            return this;
        }

        public iPhoneBuilder setScreen(double screen) {
            this.screen = screen;
            return this;
        }

        public iPhoneBuilder setCamera(int camera) {
            this.camera = camera;
            return this;
        }

        public iPhoneBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public iPhone build() {
            return new iPhone(this);
        }
    }

    @Override
    public String toString() {
        return "iPhone{" + "Model='" + model + '\'' + ", iOS='" + operationalSystem + '\'' + ", Resolution='" + screen + '\'' +
            ", Camera (px)='" + camera + ", Processor='" + processor + '\'' + '}';
    }

}
