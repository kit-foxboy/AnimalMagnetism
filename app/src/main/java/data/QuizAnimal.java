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
    private boolean mIsTextInput;
    private TreeMap<String, Integer> mQuestions = new TreeMap<>();


    //instance properties
    public String getName() { return mName; }

    public String getDescription() { return mDescription; }

    public String getCaption() { return mCaption; }

    public void setCaption(String caption) { mCaption = caption; }

    public TreeMap<String, Integer> getQuestions() { return mQuestions; }

    public void updateScore(String question, int score)
    {
        int currentScore = mQuestions.get(question);
        currentScore += score;

        mQuestions.put(question, currentScore);
    }

    public Integer getScore(String question) { return mQuestions.get(question); }


    //class constructors
    public QuizAnimal(String name, String description, boolean isTextInput, String[] questions)
    {
        //init vars
        mName = name;
        mDescription = description;
        mIsTextInput = isTextInput;

        for (String question : questions)
        {
            mQuestions.put(question, 0);
        }
    }
}
