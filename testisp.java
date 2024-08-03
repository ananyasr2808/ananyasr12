interface Audio{
void playaudio();
}

interface Video{
void playvideo();
}

class Spotify implements Audio,Video{
public void playaudio()
{
System.out.println("play audio");
}
public void playvideo()
{
System.out.println("play video");
}
}

class jiosaavn implements Audio{
public void playaudio()
{
System.out.println("play audio");
}
}

class testisp{
public static void main(String args[]){
jiosaavn jj=new jiosaavn();
jj.playaudio();
}
}










