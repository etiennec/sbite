package lib.sbet;

import java.util.Map;

/**
 * This class contains most common logic for text parsing & beans manipulation used by {@link SbetWriter} implementations.
 */
public abstract class BaseSbetWriter implements SbetWriter{


    /**
     *
     * @param input an input string, possibly with some templating elements
     * @return the output string, with all templating elements evaluated using the passed data.
     */
    public String convertString(String input, Map<String, Object> data) {
        // TODO
    }

    /**
     *
     * @param expression a Sbet expression (~ BeanUtils expression)
     * @param data the data to use to evaluate the expression
     * @return the evaluated expression, or an empty String if there's a null value along the path.
     */
    public String evaluateExpression(String expression, Map<String, Object> data) {
        // TODO
    }
}