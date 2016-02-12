/*
 * Copyright 2016 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.yangutils.parser.impl.listeners;

import org.onosproject.yangutils.parser.antlrgencode.GeneratedYangParser;
import org.onosproject.yangutils.parser.impl.TreeWalkListener;

/*
 * Reference: RFC6020 and YANG ANTLR Grammar
 *
 * ABNF grammar as per RFC6020
 *  list-stmt           = list-keyword sep identifier-arg-str optsep
 *                        "{" stmtsep
 *                            ;; these stmts can appear in any order
 *                            [when-stmt stmtsep]
 *                            *(if-feature-stmt stmtsep)
 *                            *(must-stmt stmtsep)
 *                            [key-stmt stmtsep]
 *                            *(unique-stmt stmtsep)
 *                            [config-stmt stmtsep]
 *                            [min-elements-stmt stmtsep]
 *                            [max-elements-stmt stmtsep]
 *                            [ordered-by-stmt stmtsep]
 *                            [status-stmt stmtsep]
 *                            [description-stmt stmtsep]
 *                            [reference-stmt stmtsep]
 *                            *((typedef-stmt /
 *                               grouping-stmt) stmtsep)
 *                            1*(data-def-stmt stmtsep)
 *                         "}"
 *
 * ANTLR grammar rule
 *  listStatement : LIST_KEYWORD IDENTIFIER LEFT_CURLY_BRACE (whenStatement | ifFeatureStatement | mustStatement |
 *  keyStatement | uniqueStatement | configStatement | minElementsStatement | maxElementsStatement |
 *  orderedByStatement | statusStatement | descriptionStatement | referenceStatement | typedefStatement |
 *  groupingStatement| dataDefStatement)* RIGHT_CURLY_BRACE;
 */

/**
 * Implements listener based call back function corresponding to the "list"
 * rule defined in ANTLR grammar file for corresponding ABNF rule in RFC 6020.
 */
public final class ListListener {

    /**
     * Creates a new list listener.
     */
    private ListListener() {
    }

    /**
     * It is called when parser receives an input matching the grammar
     * rule (list), performs validation and updates the data model
     * tree.
     *
     * @param listener listener's object.
     * @param ctx context object of the grammar rule.
     */
    public static void processListEntry(TreeWalkListener listener,
                                             GeneratedYangParser.ListStatementContext ctx) {
        // TODO
    }

    /**
     * It is called when parser exits from grammar rule (list), it performs
     * validation and updates the data model tree.
     *
     * @param listener listener's object.
     * @param ctx context object of the grammar rule.
     */
    public static void processListExit(TreeWalkListener listener,
                                            GeneratedYangParser.ListStatementContext ctx) {
        // TODO
    }
}