
    class Temperature {
        private double celsius;
    
        public Temperature(double celsius) {
            this.celsius = celsius;
        }
    
        public double getCelsius() {
            return celsius;
        }
    
        public double getFahrenheit() {
            return (celsius * 9 / 5) + 32;
        }
    }
    
    public class Custom {
        public static void main(String[] args) {
            Temperature tempCelsius = new Temperature(25.0);
    
            System.out.println("Temperature in Celsius: " + tempCelsius.getCelsius());
            System.out.println("Temperature in Fahrenheit: " + tempCelsius.getFahrenheit());
        }
    }
    

