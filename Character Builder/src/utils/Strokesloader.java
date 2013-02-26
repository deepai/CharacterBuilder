package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

import android.gesture.Gesture;

public class Strokesloader {
	
	public static HashMap<String,ArrayList<float[]>> loadStrokes(String filename) throws Exception 
	{
		ObjectInputStream oin;
		oin=new ObjectInputStream(new FileInputStream(new File(filename)));
		HashMap<String,ArrayList<float[]>> readObject = ((HashMap<String,ArrayList<float[]>>) oin.readObject());	
		oin.close();
		return readObject;
	}
	
}
