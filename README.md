# MuSearch
Java Collaborative filtering Engine.

Implemented using resources from [Algorithms, 4th Edition](https://algs4.cs.princeton.edu/home/) By Sedgewick and Wayne.
## Idea
Given a data set of 2 columns: User and Song, a graph can be created where user nodes are connected to song nodes. We can search for users that have similar song preferences and recommend each other songs.

## Example with fruit purchase
Here we see that all 3 users bought apples so we assume they have similar taste preference. We find that users 1 and 2 bought oranges, which user 3 did not, therefore oranges would a good recommendation to user 3.

![Example Image](https://miro.medium.com/max/1001/1*skK2fqWiBF7weHU8SjuCzw.png)
