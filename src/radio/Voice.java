/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 * a class to model a user's voice. A voice has a key word
 * that can be recognized by the radio.
 * @author dancye, 2018
 */
public class Voice 
{
   public static final String KEY_WORD_STOP="Stop Music";
   private String keyWord = "";
    
    public boolean equals(Object other)
    {
        if(((Voice)other).getKeyWord().equals(KEY_WORD_STOP))
        {
            return true;
        }
        return false;
    }

    /**
     * @return the keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * @param keyWord the keyWord to set
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
