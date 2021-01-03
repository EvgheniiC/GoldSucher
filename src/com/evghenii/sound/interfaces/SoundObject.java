package com.evghenii.sound.interfaces;

import com.evghenii.enums.ActionResult;

import javax.sound.sampled.Clip;

public interface SoundObject {

    Clip getSoundClip(ActionResult actionResult);
    
}
