/**
 * Created by tiffanywhite on 2/1/16.
 */
public class Cart {
    int numBooks = 0;
    int numBookmarks = 0;
    int numPaintings = 0;

    public int addABook() {
        numBooks++;
     return numBooks;
    }

    public int removeABook() {

        if(numBooks > 0) {
            numBooks--;
        }
    return numBooks;
    }

    public int addBookmarks() {
        numBookmarks++;
      return numBookmarks;
    }

    public int removeBookmarks() {
        if (numBookmarks > 0) {
            numBookmarks--;
        }
    return numBookmarks;
    }

    
    public int addPaintings() {
        numPaintings++;
        return numPaintings;
    }

    public int removeAPainting() {
        if (numPaintings > 0) {
            numPaintings--;
        }
    return numPaintings;
    }
} 


