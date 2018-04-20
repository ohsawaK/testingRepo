import objectdraw.*;
import java.awt.*;

// add comment.
// this file is written in shift-jis?

public class testChar extends WindowController {

    @Override public void onMousePress( Location point ) {
        new Text("ƒeƒXƒg", 40, 50, canvas );
    }

    @Override public void onMouseRelease( Location point ) {
        canvas.clear();
    }
}