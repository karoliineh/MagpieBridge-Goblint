package gobpie;

/**
 * The Class GobPieConfiguration.
 * <p>
 * Corresponding object to the GobPie configuration JSON.
 *
 * @author Karoliine Holter
 * @since 0.0.2
 */

public class GobPieConfiguration {

    private String goblintConf;
    private String[] preAnalyzeCommand;
    private Boolean showCfg;
    private Boolean explodeGroupWarnings;

    public String getGoblintConf() {
        return this.goblintConf;
    }

    public String[] getPreAnalyzeCommand() {
        if (preAnalyzeCommand == null || preAnalyzeCommand.length == 0) return null;
        return this.preAnalyzeCommand;
    }

    public Boolean showCfg() {
        return this.showCfg;
    }

    public Boolean explodeGroupWarnings() {
        return explodeGroupWarnings == null || explodeGroupWarnings;
    }
}
