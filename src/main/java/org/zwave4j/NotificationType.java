package org.zwave4j;

/**
 * @author zagumennikov
 */
public enum NotificationType {
    VALUE_ADDED,
    VALUE_REMOVED,
    VALUE_CHANGED,
    VALUE_REFRESHED,
    GROUP,
    NODE_NEW,
    NODE_ADDED,
    NODE_REMOVED,
    NODE_PROTOCOL_INFO,
    NODE_NAMING,
    NODE_EVENT,
    POLLING_DISABLED,
    POLLING_ENABLED,
    SCENE_EVENT,
    CREATE_BUTTON,
    DELETE_BUTTON,
    BUTTON_ON,
    BUTTON_OFF,
    DRIVER_READY,
    DRIVER_FAILED,
    DRIVER_RESET,
    ESSENTIAL_NODE_QUERIES_COMPLETE,
    NODE_QUERIES_COMPLETE,
    AWAKE_NODES_QUERIES,
    ALL_NODES_QUERIED_SOME_DEAD,
    ALL_NODES_QUERIED,
    NOTIFICATION
}
