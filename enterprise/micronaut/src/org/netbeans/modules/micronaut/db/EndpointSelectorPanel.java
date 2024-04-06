/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.micronaut.db;

import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import org.openide.NotifyDescriptor;

/**
 *
 * @author Dusan Balek
 */
public class EndpointSelectorPanel extends javax.swing.JPanel {

    /**
     * Creates new form EndpointSelectorPanel
     */
    public EndpointSelectorPanel(List<NotifyDescriptor.QuickPick.Item> endpoints) {
        initComponents();
        selectorList.addListSelectionListener(evt -> {
            firePropertyChange("selection", null, null);
        });
        selectorList.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof NotifyDescriptor.QuickPick.Item) {
                    NotifyDescriptor.QuickPick.Item item = (NotifyDescriptor.QuickPick.Item) value;
                    renderer.setText(item.getLabel() + "  " + item.getDescription());
                }
                return renderer;
            }
        });
        DefaultListModel<NotifyDescriptor.QuickPick.Item> model = new DefaultListModel<>();
        model.addAll(endpoints);
        selectorList.setModel(model);
    }

    public List<NotifyDescriptor.QuickPick.Item> getSelectedEndpoints() {
        return selectorList.getSelectedValuesList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectorLabel = new javax.swing.JLabel();
        selectorScrollPane = new javax.swing.JScrollPane();
        selectorList = new javax.swing.JList<>();

        selectorLabel.setLabelFor(selectorList);
        org.openide.awt.Mnemonics.setLocalizedText(selectorLabel, org.openide.util.NbBundle.getMessage(EndpointSelectorPanel.class, "LBL_endpoints_select")); // NOI18N

        selectorScrollPane.setViewportView(selectorList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectorScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectorLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectorScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel selectorLabel;
    private javax.swing.JList<NotifyDescriptor.QuickPick.Item> selectorList;
    private javax.swing.JScrollPane selectorScrollPane;
    // End of variables declaration//GEN-END:variables
}
