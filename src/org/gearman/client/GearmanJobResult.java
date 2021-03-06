/*
 * Copyright (C) 2009 by Eric Lambert <Eric.Lambert@sun.com>
 * Use and distribution licensed under the BSD license.  See
 * the COPYING file in the parent directory for full text.
 */
package org.gearman.client;

public interface GearmanJobResult {

    /**
     * Retrieve the results generated by the {@link GearmanJob} which generated
     * this <tt>GearmanJobResult</tt>
     *
     * @return the results generated by the job or an empty array if no results
     *         were generated.
     */
    byte[] getResults();

    /**
     * Retrieve the warnings generated by the {@link GearmanJob} which generated
     * this <tt>GearmanJobResult</tt>
     *
     * @return the warnings generated by the job or an empty array if no
     *         warnings were generated.
     */
    byte[] getWarnings();

    /**
     * Retrieve the exceptions generated by the {@link GearmanJob} which
     * generated this <tt>GearmanJobResult</tt>
     *
     * @return the exceptions generated by the job or an empty array if no
     *         exceptions were generated.
     */
    byte[] getExceptions();

    /**
     * Retrieves the denominator value as generated by the {@link GearmanJob}
     *
     * @return denominator value.
     */
    long getDenominator();

    /**
     * Retrieves the numerator value as generated by the {@link GearmanJob}
     *
     * @return numerator value.
     */
    long getNumerator();

    /**
     * Retrieves the job handle for the job which generated this
     * <tt>GearmanJobResult</tt>.
     *
     * @return the job handle
     */
    byte[] getJobHandle();

    /**
     * Determine with the job completed with out encountering exceptions or
     * problems.
     *
     * @return true if the job completed successfully, else false.
     */
    boolean jobSucceeded();
}
