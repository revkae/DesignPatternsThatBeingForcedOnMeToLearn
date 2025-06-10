package Adapter;

public class UsbCToHdmiAdapter implements Hdmi {

    private UsbC usbC;

    public UsbCToHdmiAdapter(UsbC usbC) {
        this.usbC = usbC;
    }

    @Override
    public void sendVideo(String videoData) {
        usbC.transferData("VIDEO: " + videoData);
    }

    @Override
    public void sendAudio(String audioData) {
        usbC.transferData("AUDIO: " + audioData);
    }
}
