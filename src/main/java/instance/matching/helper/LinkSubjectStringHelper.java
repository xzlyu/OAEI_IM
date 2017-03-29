package instance.matching.helper;

import static instance.matching.pr.unit.VariableDef.LINK_SIGNAL;

/**
 * Created by ciferlv on 17-3-6.
 */
public class LinkSubjectStringHelper {

    public static String linkSubjectString(String subject1, String subject2) {

        subject1 = subject1.toLowerCase();
        subject2 = subject2.toLowerCase();
        if (subject1.compareTo(subject2) < 0) {
            return subject1 + LINK_SIGNAL + subject2;
        } else {
            return subject2 + LINK_SIGNAL + subject1;
        }
    }

}
