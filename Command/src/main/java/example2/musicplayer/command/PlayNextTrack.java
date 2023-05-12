package example2.musicplayer.command;

import example2.musicplayer.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void play() {
        musicPlayer.playNextTrack();
    }
}
