package pub.etti.tictactoe;


import java.util.Random;
public class Board
{
    private static final Random RAND = new Random();
    private char[] grid;
    private char currentPlayer;
    private boolean gameOver;

    public Board()
    {
        grid = new char[9];
        startGame(); // porneste jocul si seteaza valorile din array-ul grid

    }

    public boolean isOver()
    {
        return gameOver;
    }

    public char game(int x,int y)
    {
        if (!gameOver && grid[3 * y +x] == ' ')
        {
            grid[3 * y + x] = currentPlayer;
            changePlayer(); //schimba jucatorul (jucatorul cu X sau jucatorul cu O)
        }

        return checkOver(); // intoarce valoarea intoarsa de metoda care verifica daca s-a terminat jocul
    }

    public void changePlayer()
    {
        currentPlayer = (currentPlayer== 'X' ? 'O' : 'X');
    }

    public char getGrid(int x,int y)
    {
        return grid [3 * y + x];
    }

    public void startGame()
    {
        for (int i = 0 ; i<grid.length;i++)
        {
            grid[i] = ' ';
        }
        currentPlayer = 'X';
        gameOver = false;
    }

    public char checkOver()
    {
        for (int i = 0 ; i<3;i++)
        {
            for (int i = 0; i < 3; i++)
            {
                if (getGrid(i, 0) != ' ' && getGrid(i, 0) == getGrid(i, 1) && getGrid(i, 1) == getGrid(i, 2))
                {
                    gameOver = true;
                    return getGrid(i, 0);
                }

                else if (getGrid(0,i) != ' ' && getGrid(0,i) == getGrid(1,i) && getGrid(1,i) && getGrid(2,i))
                {
                    gameOver = true;
                    return getGrid(0,i);
                }
            }

            if (getGrid(0,0) != ' ' && getGrid(0,0) == getGrid(1,1) && getGrid(1,1) == getGrid(2,2))
            {
                gameOver = true;
                return getGrid(0,0);
            }

            if (getGrid(2,0) != ' ' && getGrid(2,0) == getGrid(1,1) && getGrid(1,1) == getGrid(0,2))
            {
                gameOver = true;
                return getGrid(2,0);
            }

            for (int i = 0; i <9 ; i++)
            {
                if (grid[i] == ' ')
                    return ' ';
            }


            return 'T';
        }


    }

    public char AI()
    {
        if (!gameOver)
        {
            int position = -1;

            do
            {
                position = RAND.nextInt(9);
            }
            while (grid[position]!=' ');

            grid[position] = currentPlayer;
            changePlayer();
        }
        return checkOver();
    }









}
