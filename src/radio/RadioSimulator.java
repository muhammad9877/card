/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 * a test class to simulate creating and radio and
 *  carrying out our use case under construction (lower volume
 *  in response to talking).
 * @author dancye, 2018
 */
public class RadioSimulator {
    
    public static void main(String[] args)
    {
        Radio radio = new Radio();
        VoiceRecognizer vr = new VoiceRecognizer(radio);
        radio.switchOn();
        radio.setVolume(Radio.MAX_VOLUME);//turn up your favourite song
        System.out.println("Is the radio on? " + radio.isOn());
        System.out.println("And playing at volume: " + radio.getVolume());
        Voice driverV = new Voice();
        radio.registerDriversVoice(driverV);//connect the Radio and the driver's voice
        driverV.setKeyWord("Stop Music");
        if(vr.recognize(driverV))
        {
            System.out.println("Now playing at volume: " +radio.getVolume());
        }      
    }
    
}
