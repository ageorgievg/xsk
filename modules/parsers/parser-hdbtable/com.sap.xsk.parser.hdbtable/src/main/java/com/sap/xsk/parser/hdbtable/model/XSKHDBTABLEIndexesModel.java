/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.parser.hdbtable.model;

import java.util.List;

public class XSKHDBTABLEIndexesModel {

    private String name;
    private boolean unique;
    private String order;
    private List<String> indexColumns;
    private String indexType;

    public XSKHDBTABLEIndexesModel() {}

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public List<String> getIndexColumns() {
        return indexColumns;
    }

    public void setIndexColumns(List<String> indexColumns) {
        this.indexColumns = indexColumns;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public String getIndexName() {
        return name;
    }

    public void setIndexName(String name) {
        this.name = name;
    }
}
