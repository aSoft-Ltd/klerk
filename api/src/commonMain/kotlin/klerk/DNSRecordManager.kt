package klerk

import kollections.List
import koncurrent.Later

interface DNSRecordManager {
    fun list(page: Int = 1, limit: Int = 10): Later<List<DNSRecord>>
    fun create(record: DNSRecord): Later<DNSRecord>
    fun update(record: DNSRecord): Later<DNSRecord>
    fun delete(uid: String): Later<DNSRecord>
}