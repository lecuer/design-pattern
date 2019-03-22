package design_pattern.structural_patterns.adapter_pattern.adapter;

import design_pattern.structural_patterns.adapter_pattern.dto.Mp4Player;
import design_pattern.structural_patterns.adapter_pattern.dto.VlcPlayer;
import design_pattern.structural_patterns.adapter_pattern.interf.AdvancedMediaPlayer;
import design_pattern.structural_patterns.adapter_pattern.interf.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}