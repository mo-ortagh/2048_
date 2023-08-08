# 2048
2048 is a browser game written by 19—year-old Italian developer Gabriele Cirulli (ital. Gabriele Cirulli) in the JavaScript programming language. 
The playing field has the shape of a 4x4 square. 
The goal of the game is to get a tile with a face value of "2048".

In each round, a tile with a nominal value of "2" (with a probability of 90%) or "4" (with a probability of 10%) appears.
By pressing the arrow, the player can throw all the tiles of the playing field into one of the 4 sides. 
If, when dropping, two tiles of the same denomination "fly" into one another, then they turn into one, the denomination of which is equal to the sum of the connected tiles.
After each move, a new tile with a face value of "2" or "4" appears on the free section of the field. 
If the location of the tiles or their nominal value does not change when the button is pressed, then the move is not made.
If there are more than two tiles of the same denomination in one row or in one column, then when they are reset, they begin to connect from the side to which they were directed. 
For example, tiles (4, 4, 4) in the same row will turn into (8, 4) after a move to the left, and (4, 8) after a move to the right. 
This treatment of ambiguity allows you to more accurately form the strategy of the game.
For each connection, the game points are increased by the face value of the resulting tile.
The game ends in defeat if it is impossible to perform an action after the next move.

This project is my own version of 2048 written in the Java.
