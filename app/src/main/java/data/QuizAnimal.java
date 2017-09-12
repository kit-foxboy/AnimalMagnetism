package data;

import java.util.TreeMap;

/**
 * Created by Geoff "Kit Foxboy" Lambert on 8/29/17.
 */

public class QuizAnimal
{
    //instance vars
    private String mName;
    private String mDescription;
    private String mCaption;
    private String mImageName;
    private TreeMap<String, Integer> mQuestions = new TreeMap<>();


    //instance properties
    public String getName() { return mName; }

    public String getDescription() { return mDescription; }

    public String getCaption() { return mCaption; }

    public void setCaption(String caption) { mCaption = caption; }

    public String getImageName() { return mImageName; }

    public void setImageName(String imageName) { mImageName = imageName; }


    //class constructors
    public QuizAnimal(String name, String description, String imageName, String[] questions)
    {
        //init vars
        mName = name;
        mDescription = description;
        mImageName = imageName;

        for (String question : questions)
        {
            mQuestions.put(question, 0);
        }
    }


    //class methods
    public void updateScore(String question, int score)
    {
        int currentScore = mQuestions.get(question);
        currentScore += score;

        mQuestions.put(question, currentScore);
    }

    public void resetScore(String key)
    {
        mQuestions.put(key, 0);
    }

    public int getTotalScore()
    {
        int total = 0;

        for(Integer val : mQuestions.values())
        {
            total += val;
        }

        return total;
    }

    public void resetTotalScore()
    {
        for(String key : mQuestions.keySet())
        {
            mQuestions.put(key, 0);
        }
    }
}
