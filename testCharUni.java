import objectdraw.*;
import java.awt.*;

// add comment.
// this file is written in utf-8?

public class testCharUni extends WindowController {

    @Override public void onMousePress( Location point ) {
        new Text("テスト", 40, 50, canvas );
    }

    @Override public void onMouseRelease( Location point ) {
        canvas.clear();
    }
}
