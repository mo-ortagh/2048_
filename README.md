<h1  style="color:orange align="center">Hi there, I'm Axion</a> 
<img src="https://github.com/blackcater/blackcater/raw/main/images/Hi.gif" height="32"/></h1>
<h3 align="center">Welcome to my project!</h3>
<p><b style="color:orange">2048</b> is a browser game written by 19-year-old Italian developer <i>Gabriele Cirulli</i> in the JavaScript programming language.</p> 
<p>The playing field has the shape of a 4x4 square.
The goal of the game is to get a tile with a face value of "2048".
In each round, a tile with a nominal value of "2" (with a probability of 90%) or "4" (with a probability of 10%) appears.
If, when dropping, two tiles of the same denomination "fly" into one another, then they turn into one, the denomination of which is equal to the sum of the connected tiles.
After each move, a new tile with a face value of "2" or "4" appears on the free section of the field. 
If the location of the tiles or their nominal value does not change when the button is pressed, then the move is not made.
If there are more than two tiles of the same denomination in one row or in one column, then when they are reset, they begin to connect from the side to which they were directed. 
For example, tiles (4, 4, 4) in the same row will turn into (8, 4) after a move to the left, and (4, 8) after a move to the right. 
This treatment of ambiguity allows you to more accurately form the strategy of the game.
For each connection, the game points are increased by the face value of the resulting tile.
The game ends in defeat if it is impossible to perform an action after the next move.</p>

<p><b>This project is my own version of 2048 written in Java.</b></p>
<h3  style="color:orange" align="left">SETTINGS</h3>
<p>To control the tiles, use the keys <b style="color:orange">LEFT, RIGHT, UP, DOWN</b>.<br>
Press <b style="color:orange">Z</b> if you want go back one turn.<br>
You can make a random move if you press <b style="color:orange">R</b>.<br>
Press <b style="color:orange">A</b> to make smart-move (Auto move).</p>
<pre style="color:orange">               A
              A A
             A   A
            A     A
           A       A
          A         A
         A-----------A
        A             A
       A               A
      A                 A
     A                   A</pre>
