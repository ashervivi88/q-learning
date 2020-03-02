# q-learning-java
Reinforcement learning - Q learning in Java. Original code explained here: http://technobium.com/reinforcement-learning-q-learning-java/

##Purpose:
This code builds on the technobium q-learning and uses it to solve randomly-created mazes

##How to run:
Run code from the QMazeDriver file. This will randomly generate mazes and show results of Q Learning solving them.
Choose how many times you want to run the code by editing the numRuns variable (default setting is 5).

##File descriptions:
####QLearning
This is the original file found online. I added the QandPolicy method in order to output Q and policy values
more cleanly into a text file.
####MazeGenerator
This randomly generates 3 x 3 mazes that are outputted in text files.
####QMazeDriver
This driver creates a new instance of QLearning and MazeGenerator and uses them to randomly create mazes, solve them,
and output all relevant info to a text file.
####maze#.txt
These are the text files that are generated through MazeGenerator. They are numbered in the order that they are made.
####QOutput#.txt
These are the text files that are generated through QMazeDriver. They are numbered in the order that they are made.
The driver edits these to include Q and policy results after Q learning is used on each maze.
