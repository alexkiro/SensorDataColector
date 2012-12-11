package collecter;

/**
 *
 * @author Chirila Alexandru
 */
public class Test {

    public static void main(String[] args) {
        Collecter c = new Collecter("run3.xml", Label.run);
        c.startCollecting();
        for (int i = 0; i < 50; i++) {
            c.addGpsData(40.0 + i*(0.01), 21.0 - i*(0.0001), 12.214, (120.51+(i*30))*i % 360.0, 60, System.currentTimeMillis());
            c.addAccelerometerData(11.1, -0.1, 9.81, System.currentTimeMillis());
            c.addProximityData(0.0, System.currentTimeMillis());
            c.addRelativeHumidityData(23.0, System.currentTimeMillis());
            c.addAmbientTemperatureData(18.5, System.currentTimeMillis());
            c.addMagneticFieldData(12.0, 0.0, 45.7, System.currentTimeMillis());            
        }
        c.stopCollecting();
        
        
    }
}
