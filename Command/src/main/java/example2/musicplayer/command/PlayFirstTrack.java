package example2.musicplayer.command;

import example2.musicplayer.MusicPlayer;

public class PlayFirstTrack implements  MusicPlayerCommand{

    private MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void play() {
        musicPlayer.playFirstTrack();
    }
}
