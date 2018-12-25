package com.djordje.museum;

public class Room {

    int id;
    int name;
    int text;
    int image;
    int audio;
    //ArrayList<Exibit> exibit;

    public Room(int id)
    {
        this.id = id;
        SetRoomContent(id);
    }

    private void SetRoomContent(int id)
    {
        switch (id)
        {
            case 1:
                name = R.string.room1Title;
                text = R.string.room1text;
                image = R.mipmap.ic_launcher;
                break;
            case 2:
                name = R.string.room2Title;
                text = R.string.room2text;
                image = R.mipmap.ic_launcher;
                break;
            case 3:
                name = R.string.room1Title;
                text = R.string.room1text;
                image = R.mipmap.ic_launcher;
                break;
            case 4:
                name = R.string.room2Title;
                text = R.string.room2text;
                image = R.mipmap.ic_launcher;
                break;
        }
    }
}
