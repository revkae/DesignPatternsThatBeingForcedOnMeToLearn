package Adapter;

public class Laptop {

    UsbC usbPort;
    Hdmi hdmiAdapter;

    public Laptop() {
        this.usbPort = new UsbC();
        this.hdmiAdapter = new UsbCToHdmiAdapter(usbPort);
    }

    public void send() {
        hdmiAdapter.sendVideo("4K video stream");
        hdmiAdapter.sendAudio("Dolby Atmos audio");
    }
}
