public class Covid {
    public static String covid(float bodyTemperature, boolean difficultyBreathing,
                               boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidneyDisease, boolean respiratoryDisease, String provincia
    ){

        if (tieneSintomasGraves(bodyTemperature, difficultyBreathing, diabetes, cancer, isPregnant,
                isOver60yearsold, hepatic, kidneyDisease, respiratoryDisease)) {
            return "/diagnostico/" + provincia;
        } else if (tieneFiebre(bodyTemperature)) {
            return "/cuarentena/";
        } else {
            return "/diagnostico_bueno/";
        }
    }

    private static boolean tieneSintomasGraves(float bodyTemperature, boolean difficultyBreathing,
                                             boolean diabetes, boolean cancer, boolean isPregnant,
                                             boolean isOver60yearsold, boolean hepatic,
                                             boolean kidneyDisease, boolean respiratoryDisease) {
        return bodyTemperature >= 38 && difficultyBreathing &&
                (diabetes || cancer || isPregnant || isOver60yearsold ||
                        hepatic || kidneyDisease || respiratoryDisease);
    }

    private static boolean tieneFiebre(float bodyTemperature) {
        return bodyTemperature >= 38;
    }

}


