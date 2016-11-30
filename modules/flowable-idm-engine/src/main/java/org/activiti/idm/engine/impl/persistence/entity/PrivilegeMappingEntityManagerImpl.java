/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.idm.engine.impl.persistence.entity;

import org.activiti.engine.common.impl.persistence.entity.data.DataManager;
import org.activiti.idm.engine.IdmEngineConfiguration;
import org.activiti.idm.engine.impl.persistence.entity.data.PrivilegeMappingDataManager;

public class PrivilegeMappingEntityManagerImpl extends AbstractEntityManager<PrivilegeMappingEntity> implements PrivilegeMappingEntityManager {

  protected PrivilegeMappingDataManager privilegeMappingDataManager;
  
  public PrivilegeMappingEntityManagerImpl(IdmEngineConfiguration idmEngineConfiguration, PrivilegeMappingDataManager privilegeMappingDataManager) {
    super(idmEngineConfiguration);
    this.privilegeMappingDataManager = privilegeMappingDataManager;
  }

  @Override
  protected DataManager<PrivilegeMappingEntity> getDataManager() {
    return privilegeMappingDataManager;
  }
  
  @Override
  public void deleteByPrivilegeId(String privilegeId) {
    privilegeMappingDataManager.deleteByPrivilegeId(privilegeId);
  }
  
  @Override
  public void deleteByPrivilegeIdAndUserId(String privilegeId, String userId) {
    privilegeMappingDataManager.deleteByPrivilegeIdAndUserId(privilegeId, userId);
  }
  
  @Override
  public void deleteByPrivilegeIdAndGroupId(String privilegeId, String groupId) {
    privilegeMappingDataManager.deleteByPrivilegeIdAndGroupId(privilegeId, groupId);
  }
  
}
