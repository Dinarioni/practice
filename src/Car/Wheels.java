package Car;

public abstract class Wheels {

        private double radius;
        private String season;
        private String name;

        public Wheels(double radius, String season, String name) {
            this.radius = radius;
            this.season = season;
            this.name = name;
        }
}
