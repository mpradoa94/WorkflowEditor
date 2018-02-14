/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import com.mxgraph.swing.handler.mxKeyboardHandler;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.util.mxGraphActions;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author MPA
 */
class EditorKeyboardHandler extends mxKeyboardHandler {

    public EditorKeyboardHandler(mxGraphComponent graphComponent) {
        super(graphComponent);
    }

    protected InputMap getInputMap(int condition) {
        InputMap map = super.getInputMap(condition);

        if (condition == JComponent.WHEN_FOCUSED && map != null) {
            map.put(KeyStroke.getKeyStroke("control S"), "save");
            map.put(KeyStroke.getKeyStroke("control N"), "new");
            map.put(KeyStroke.getKeyStroke("control O"), "open");

            map.put(KeyStroke.getKeyStroke("control Z"), "undo");
            map.put(KeyStroke.getKeyStroke("control Y"), "redo");
        }

        return map;
    }

    protected ActionMap createActionMap() {
        ActionMap map = super.createActionMap();
        map.put("undo", new AccionesEditor.AccionHistoria(true));
        map.put("redo", new AccionesEditor.AccionHistoria(false));
        
        return map;
    }
}
