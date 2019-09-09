package com.citiustech.mrr;

/**
* This class was automatically generated by the data modeler tool.
*/

public class WorkflowItemServiceTask implements java.io.Serializable, org.kie.api.runtime.process.WorkItemHandler {

    static final long serialVersionUID = 1L;
    
    private static final String sql = "select createdBy_id, actualOwner_id from Task WHERE ProcessInstanceId = ? and name = ? ";
	private static final String updateSql = "UPDATE WorkflowItem SET StatusCode = ? , AssignedTo = ? WHERE ProcessInstanceId = ? ";
     java.util.Map<String, Object> results = new java.util.HashMap<String, Object>();            

    public WorkflowItemServiceTask() {
    }
    
    @Override
    public void executeWorkItem(org.kie.api.runtime.process.WorkItem workItem, org.kie.api.runtime.process.WorkItemManager manager) {
                com.citiustech.mrr.WorkflowItem workFlow = (com.citiustech.mrr.WorkflowItem) workItem.getParameter("workflowitem");
        // extract parameters
        java.util.Map<String, Object> results = new java.util.HashMap<String, Object>();
       
        System.out.println("[Inside:WorkflowItemServiceTask:Expression] [message:ProcessInstanceId is] " + workFlow.getProcessInstanceId());
                                Long ProcessInstanceId = workFlow.getProcessInstanceId();
                                String status = workFlow.getStatusCode();
                                System.out.print("status code is : " + status);
                                System.out.print("task name is : " + workFlow.getTaskName());
        try (java.sql.Connection conn = com.citiustech.mrr.MRRConnectionUtil.getConnection();java.sql.PreparedStatement stmt = conn.prepareStatement(sql);) {
        stmt.setInt(1, workFlow.getProcessInstanceId().intValue()); 
        stmt.setString(2, workFlow.getTaskName());
        java.sql.ResultSet rs = stmt.executeQuery();
         while(rs.next()){
        //Retrieve by column name
        
         String createdBy = rs.getString("createdBy_id");
         String actualOwner = rs.getString("actualOwner_id");

         //Display values
         System.out.print(", createdBy: " + createdBy);
         System.out.println(", actualOwner: " + actualOwner);
		 updateWorkItem(workFlow,createdBy,manager,workItem);
             
         }
         manager.completeWorkItem(workItem.getId(), results);
        } catch(java.sql.SQLException ex){
            System.out.println("SQL query execution failed: " + ex);
        }
        
    }
	
	//Update StatusCode and AssignedTo
	public void updateWorkItem(com.citiustech.mrr.WorkflowItem workFlow, String createdBy, org.kie.api.runtime.process.WorkItemManager manager,
	                           org.kie.api.runtime.process.WorkItem workItem){
	    System.out.println("Inside Update method " );
	    try (java.sql.Connection conn = com.citiustech.mrr.MRRConnectionUtil.getConnection();java.sql.PreparedStatement stmt = conn.prepareStatement(updateSql);) {
            System.out.println("Inside Try block " );
            System.out.println("Status is "  + workFlow.getStatusCode());
		 stmt.setString(1, workFlow.getStatusCode());
         stmt.setString(2, createdBy);
         stmt.setInt(3, workFlow.getProcessInstanceId().intValue());
         System.out.println("Before executeUpdate method " );
         stmt.executeUpdate();
          System.out.println("After executeUpdate method " );
         results.put("workflowitem", workFlow);
        } catch(java.sql.SQLException ex){
            System.out.println("SQL query execution failed: " + ex);
        }
	}
                

    @Override
    public void abortWorkItem(org.kie.api.runtime.process.WorkItem workItem, org.kie.api.runtime.process.WorkItemManager manager) {
        // Do nothing, notifications cannot be aborted
        System.out.println("--> WorkflowItemServiceTask.abortWorkItem()...");
        manager.abortWorkItem(workItem.getId());
    }

}
