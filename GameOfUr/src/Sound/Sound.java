package Sound;

import java.io.FileInputStream;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

//import java.io.File;

//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;

public class Sound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	File Main = new File("Main.wav");
		//PlaySound(Main);
//	}
	//static void PlaySound(File Sound)
	//{
		//try {
			//Clip clip = AudioSystem.getClip();
			//clip.open(AudioSystem.getAudioInputStream(Sound));
			//clip.start();
	///		
		///	Thread.sleep(clip.getMicrosecondLength()/500);
///		} catch (Exception e)
		//{
			
//		}
///	}	
		public static void music()
		{
			AudioPlayer MGP = AudioPlayer.player;
			AudioStream BGM;
			AudioData MD;
			ContinuousAudioDataStream loop = null;
			
			try {
				BGM = new AudioStream(new FileInputStream("Main.wav"));
			}catch(IOexception error) 
			{
				
			}
			}
			
		https://www.youtube.com/watch?v=VMSTTg5EEnY&t=303s;
			
			
			
			
			
		}

	}
