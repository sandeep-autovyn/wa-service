package com.wa.model.workflow;

import java.util.List;
import java.util.UUID;

public class Workflow {
    private UUID workflowId;
    private String workflowName;
    private String workflowDescription;
    private List<WorkflowStep> workflowSteps;
}
