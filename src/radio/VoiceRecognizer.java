/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 * A voice recognizer class.
 * Used to determine whether the voice we "heard" 
 * is the one we are listening for
 * @author dancye, 2018
 */
public class VoiceRecognizer 
{
    private Radio carRadio;
    
    public VoiceRecognizer(Radio radio)
    {
        carRadio = radio;
    }
    
    public boolean recognize(Voice driver)
    {
        if (driver.equals(carRadio.getDriversVoice()))
        {
            carRadio.lowerVolumeWhenTalking();
            return true;
        }
        return false;
    }
}
