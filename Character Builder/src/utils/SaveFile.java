package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import android.gesture.Gesture;

public class SaveFile {

	public static int WriteFile(String name,HashMap<String,ArrayList<float[]>> Map) 
	{
		int t=0;
		try{
			File f=new File(name);
			if(!f.exists())
				f.createNewFile();
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f,false));
			out.writeObject(Map);
			out.close();
		}catch(Exception e)
		{
			t=1;
		}
		return t;
	}
}
