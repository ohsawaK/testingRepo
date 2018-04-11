import objectdraw.*;
import java.awt.*;

// add comment.

public class TouchyWindow extends WindowController {

    @Override public void onMousePress( Location point ) {
        new Text("I'm Touched", 40, 50, canvas );
    }

    @Override public void onMouseRelease( Location point ) {
        canvas.clear();
    }
}
