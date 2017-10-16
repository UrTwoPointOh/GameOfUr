package Sound;
 import java.io.File;

import javax.sound.sampled.AudioSystem;
 import javax.sound.sampled.Clip;





public class Sound {

	public static void main(String[] args) throws Exception
	{
		File Main2 = new File("Main2.wav");
	PlaySound(Main2);
}
	
	static void PlaySound(File Sound)
	{
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			
			
		}catch(Exception e)
		{
			
		}
	}
}
	
		

