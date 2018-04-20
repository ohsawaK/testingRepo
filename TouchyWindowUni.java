import objectdraw.*;
import java.awt.*;

// add comment.

public class TouchyWindowUni extends WindowController {

    @Override public void onMousePress( Location point ) {
        new Text("ãƒ?ã‚¹ãƒ?", 40, 50, canvas );
    }

    @Override public void onMouseRelease( Location point ) {
        canvas.clear();
    }
}
