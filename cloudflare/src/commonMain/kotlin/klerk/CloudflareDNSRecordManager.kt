package klerk

import kollections.List
import koncurrent.Later
import koncurrent.TODOLater

class CloudflareDNSRecordManager(
    private val params: CloudflareParams
) : DNSRecordManager {
    override fun list(page: Int, limit: Int): Later<List<DNSRecord>> = TODOLater()

    override fun create(record: DNSRecord): Later<DNSRecord> = TODOLater()

    override fun update(record: DNSRecord): Later<DNSRecord> = TODOLater()

    override fun delete(uid: String): Later<DNSRecord> = TODOLater()
}