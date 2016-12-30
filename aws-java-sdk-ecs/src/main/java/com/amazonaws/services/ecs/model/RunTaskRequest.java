/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RunTask"/>AWS API Documentation</a>
 */
public class RunTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not specify
     * a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified task
     * definition and the overrides it should receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a <code>command</code> override. You can also override
     * existing environment variables (that are specified in the task definition or Docker image) on a container or add
     * new environment variables to it with an <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the
     * override structure.
     * </p>
     * </note>
     */
    private TaskOverride overrides;
    /**
     * <p>
     * The number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks per
     * call.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * An optional tag specified when a task is started. For example if you automatically trigger a task to run a batch
     * process job, you could apply a unique identifier for that job to your task with the <code>startedBy</code>
     * parameter. You can then identify which tasks belong to that job by filtering the results of a <a>ListTasks</a>
     * call with the <code>startedBy</code> value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the deployment
     * ID of the service that starts it.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The task group to associate with the task. By default, if you do not specify a task group, the group
     * <code>family:TASKDEF-FAMILY</code> is applied.
     * </p>
     */
    private String group;
    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at run time).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementConstraint> placementConstraints;
    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules per task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementStrategy> placementStrategy;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not specify
     * a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not
     *        specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not specify
     * a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not
     *         specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not specify
     * a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not
     *        specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource
     *        Name (ARN) of the task definition to run. If a <code>revision</code> is not specified, the latest
     *        <code>ACTIVE</code> revision is used.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     * </p>
     * 
     * @return The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource
     *         Name (ARN) of the task definition to run. If a <code>revision</code> is not specified, the latest
     *         <code>ACTIVE</code> revision is used.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource
     *        Name (ARN) of the task definition to run. If a <code>revision</code> is not specified, the latest
     *        <code>ACTIVE</code> revision is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified task
     * definition and the overrides it should receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a <code>command</code> override. You can also override
     * existing environment variables (that are specified in the task definition or Docker image) on a container or add
     * new environment variables to it with an <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the
     * override structure.
     * </p>
     * </note>
     * 
     * @param overrides
     *        A list of container overrides in JSON format that specify the name of a container in the specified task
     *        definition and the overrides it should receive. You can override the default command for a container (that
     *        is specified in the task definition or Docker image) with a <code>command</code> override. You can also
     *        override existing environment variables (that are specified in the task definition or Docker image) on a
     *        container or add new environment variables to it with an <code>environment</code> override.</p> <note>
     *        <p>
     *        A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters
     *        of the override structure.
     *        </p>
     */

    public void setOverrides(TaskOverride overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified task
     * definition and the overrides it should receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a <code>command</code> override. You can also override
     * existing environment variables (that are specified in the task definition or Docker image) on a container or add
     * new environment variables to it with an <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the
     * override structure.
     * </p>
     * </note>
     * 
     * @return A list of container overrides in JSON format that specify the name of a container in the specified task
     *         definition and the overrides it should receive. You can override the default command for a container
     *         (that is specified in the task definition or Docker image) with a <code>command</code> override. You can
     *         also override existing environment variables (that are specified in the task definition or Docker image)
     *         on a container or add new environment variables to it with an <code>environment</code> override.</p>
     *         <note>
     *         <p>
     *         A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters
     *         of the override structure.
     *         </p>
     */

    public TaskOverride getOverrides() {
        return this.overrides;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified task
     * definition and the overrides it should receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a <code>command</code> override. You can also override
     * existing environment variables (that are specified in the task definition or Docker image) on a container or add
     * new environment variables to it with an <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the
     * override structure.
     * </p>
     * </note>
     * 
     * @param overrides
     *        A list of container overrides in JSON format that specify the name of a container in the specified task
     *        definition and the overrides it should receive. You can override the default command for a container (that
     *        is specified in the task definition or Docker image) with a <code>command</code> override. You can also
     *        override existing environment variables (that are specified in the task definition or Docker image) on a
     *        container or add new environment variables to it with an <code>environment</code> override.</p> <note>
     *        <p>
     *        A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters
     *        of the override structure.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withOverrides(TaskOverride overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * <p>
     * The number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks per
     * call.
     * </p>
     * 
     * @param count
     *        The number of instantiations of the specified task to place on your cluster. You can specify up to 10
     *        tasks per call.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks per
     * call.
     * </p>
     * 
     * @return The number of instantiations of the specified task to place on your cluster. You can specify up to 10
     *         tasks per call.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks per
     * call.
     * </p>
     * 
     * @param count
     *        The number of instantiations of the specified task to place on your cluster. You can specify up to 10
     *        tasks per call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * An optional tag specified when a task is started. For example if you automatically trigger a task to run a batch
     * process job, you could apply a unique identifier for that job to your task with the <code>startedBy</code>
     * parameter. You can then identify which tasks belong to that job by filtering the results of a <a>ListTasks</a>
     * call with the <code>startedBy</code> value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the deployment
     * ID of the service that starts it.
     * </p>
     * 
     * @param startedBy
     *        An optional tag specified when a task is started. For example if you automatically trigger a task to run a
     *        batch process job, you could apply a unique identifier for that job to your task with the
     *        <code>startedBy</code> parameter. You can then identify which tasks belong to that job by filtering the
     *        results of a <a>ListTasks</a> call with the <code>startedBy</code> value. Up to 36 letters (uppercase and
     *        lowercase), numbers, hyphens, and underscores are allowed.</p>
     *        <p>
     *        If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the
     *        deployment ID of the service that starts it.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * An optional tag specified when a task is started. For example if you automatically trigger a task to run a batch
     * process job, you could apply a unique identifier for that job to your task with the <code>startedBy</code>
     * parameter. You can then identify which tasks belong to that job by filtering the results of a <a>ListTasks</a>
     * call with the <code>startedBy</code> value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the deployment
     * ID of the service that starts it.
     * </p>
     * 
     * @return An optional tag specified when a task is started. For example if you automatically trigger a task to run
     *         a batch process job, you could apply a unique identifier for that job to your task with the
     *         <code>startedBy</code> parameter. You can then identify which tasks belong to that job by filtering the
     *         results of a <a>ListTasks</a> call with the <code>startedBy</code> value. Up to 36 letters (uppercase and
     *         lowercase), numbers, hyphens, and underscores are allowed.</p>
     *         <p>
     *         If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the
     *         deployment ID of the service that starts it.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * An optional tag specified when a task is started. For example if you automatically trigger a task to run a batch
     * process job, you could apply a unique identifier for that job to your task with the <code>startedBy</code>
     * parameter. You can then identify which tasks belong to that job by filtering the results of a <a>ListTasks</a>
     * call with the <code>startedBy</code> value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the deployment
     * ID of the service that starts it.
     * </p>
     * 
     * @param startedBy
     *        An optional tag specified when a task is started. For example if you automatically trigger a task to run a
     *        batch process job, you could apply a unique identifier for that job to your task with the
     *        <code>startedBy</code> parameter. You can then identify which tasks belong to that job by filtering the
     *        results of a <a>ListTasks</a> call with the <code>startedBy</code> value. Up to 36 letters (uppercase and
     *        lowercase), numbers, hyphens, and underscores are allowed.</p>
     *        <p>
     *        If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the
     *        deployment ID of the service that starts it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The task group to associate with the task. By default, if you do not specify a task group, the group
     * <code>family:TASKDEF-FAMILY</code> is applied.
     * </p>
     * 
     * @param group
     *        The task group to associate with the task. By default, if you do not specify a task group, the group
     *        <code>family:TASKDEF-FAMILY</code> is applied.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The task group to associate with the task. By default, if you do not specify a task group, the group
     * <code>family:TASKDEF-FAMILY</code> is applied.
     * </p>
     * 
     * @return The task group to associate with the task. By default, if you do not specify a task group, the group
     *         <code>family:TASKDEF-FAMILY</code> is applied.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The task group to associate with the task. By default, if you do not specify a task group, the group
     * <code>family:TASKDEF-FAMILY</code> is applied.
     * </p>
     * 
     * @param group
     *        The task group to associate with the task. By default, if you do not specify a task group, the group
     *        <code>family:TASKDEF-FAMILY</code> is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at run time).
     * </p>
     * 
     * @return An array of placement constraint objects to use for the task. You can specify up to 10 constraints per
     *         task (including constraints in the task definition and those specified at run time).
     */

    public java.util.List<PlacementConstraint> getPlacementConstraints() {
        if (placementConstraints == null) {
            placementConstraints = new com.amazonaws.internal.SdkInternalList<PlacementConstraint>();
        }
        return placementConstraints;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at run time).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify up to 10 constraints per
     *        task (including constraints in the task definition and those specified at run time).
     */

    public void setPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new com.amazonaws.internal.SdkInternalList<PlacementConstraint>(placementConstraints);
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at run time).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify up to 10 constraints per
     *        task (including constraints in the task definition and those specified at run time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withPlacementConstraints(PlacementConstraint... placementConstraints) {
        if (this.placementConstraints == null) {
            setPlacementConstraints(new com.amazonaws.internal.SdkInternalList<PlacementConstraint>(placementConstraints.length));
        }
        for (PlacementConstraint ele : placementConstraints) {
            this.placementConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at run time).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify up to 10 constraints per
     *        task (including constraints in the task definition and those specified at run time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules per task.
     * </p>
     * 
     * @return The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules per
     *         task.
     */

    public java.util.List<PlacementStrategy> getPlacementStrategy() {
        if (placementStrategy == null) {
            placementStrategy = new com.amazonaws.internal.SdkInternalList<PlacementStrategy>();
        }
        return placementStrategy;
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules per task.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules per
     *        task.
     */

    public void setPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        if (placementStrategy == null) {
            this.placementStrategy = null;
            return;
        }

        this.placementStrategy = new com.amazonaws.internal.SdkInternalList<PlacementStrategy>(placementStrategy);
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules per task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementStrategy(java.util.Collection)} or {@link #withPlacementStrategy(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules per
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withPlacementStrategy(PlacementStrategy... placementStrategy) {
        if (this.placementStrategy == null) {
            setPlacementStrategy(new com.amazonaws.internal.SdkInternalList<PlacementStrategy>(placementStrategy.length));
        }
        for (PlacementStrategy ele : placementStrategy) {
            this.placementStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules per task.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules per
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getPlacementStrategy() != null)
            sb.append("PlacementStrategy: ").append(getPlacementStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunTaskRequest == false)
            return false;
        RunTaskRequest other = (RunTaskRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getPlacementStrategy() == null ^ this.getPlacementStrategy() == null)
            return false;
        if (other.getPlacementStrategy() != null && other.getPlacementStrategy().equals(this.getPlacementStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getPlacementStrategy() == null) ? 0 : getPlacementStrategy().hashCode());
        return hashCode;
    }

    @Override
    public RunTaskRequest clone() {
        return (RunTaskRequest) super.clone();
    }

}
