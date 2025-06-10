package Adapter;

public class Laptop {

    public static void main(String[] args) {
        UsbC usbPort = new UsbC();
        Hdmi hdmiAdapter = new UsbCToHdmiAdapter(usbPort);
        hdmiAdapter.sendAudio("Dolby Atmos audio");
        hdmiAdapter.sendVideo("4K video stream");
    }
}
