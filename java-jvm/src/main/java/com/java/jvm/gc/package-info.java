/**
 * Created by hulb on 17/4/19.
 *
 *
 *
 * 初始参数配置。
 *
 * 堆内存分配：
 *-Xms:初始堆大小
 * -Xmx:最大堆大小
 * -XX:NewSize=n:设置年轻代大小
 * -XX:NewRatio=n:设置年轻代和年老代的比值。如:为3，表示年轻代与年老代比值为1：3，年轻代占整个年轻代年老代和的1/4
 * -XX:SurvivorRatio=n:年轻代中Eden区与两个Survivor区的比值。注意Survivor区有两个。如：3，表示Eden：Survivor=3：2，一个Survivor区占整个年轻代的1/5
 * -XX:MaxPermSize=n:设置持久代大小
 *
 *
 * 栈内存分配：
 *
 *
 * 垃圾回收器的选择：
 * -XX:+UseSerialGC:设置串行收集器
 * -XX:+UseParallelGC:设置并行收集器
 * -XX:+UseParalledlOldGC:设置并行年老代收集器
 *
 *
 * 策略的配置
 *
 *g
 * 显示：
 * -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:filename
 *
 *
 * 收集器的设置
 * -XX:ParallelGCThreads=n:设置并行收集器收集时使用的CPU数。并行收集线程数。
 * -XX:MaxGCPauseMillis=n:设置并行收集最大暂停时间
 * -XX:GCTimeRatio=n:设置垃圾回收时间占程序运行时间的百分比。公式为1/(1+n)
 *
 *
 * 并发收集器设置
 * -XX:+CMSIncrementalMode:设置为增量模式。适用于单CPU情况。
 * -XX:ParallelGCThreads=n:设置并发收集器年轻代收集方式为并行收集时，使用的CPU数。并行收集线程数。
 *
 * 运行中查看。
 *
 *
 *
 *
 */
package com.java.jvm.gc;