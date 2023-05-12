package example2;

import example2.musicplayer.MusicPlayer;
import example2.musicplayer.MusicPlayerRemote;
import example2.musicplayer.command.PlayFirstTrack;
import example2.musicplayer.command.PlayNextTrack;
import example2.musicplayer.command.PlayRandomTrack;

public class Main {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
